/**
 *
 * Shire - Blog aware static site generator 
 * Copyright (c) 2012, Sandeep Gupta
 * 
 * http://www.sangupta/projects/shire
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.sangupta.shire.site;

import java.io.File;

public abstract class AbstractSiteFile {

	/**
	 * Holds the reference to the input file.
	 */
	protected File input;
	
	public AbstractSiteFile(File file) {
		this.input = file;
	}
	
	/**
	 * Retrieve the export path for this file. It can be either
	 * the relative path to the root folder, or the permalink
	 * if any specified for this file.
	 * 
	 * @return
	 */
	public String getExportPath(final String rootPath) {
		// its not there, let's construct from base path
		String path = this.input.getAbsolutePath();
		
		if(path.startsWith(rootPath)) {
			path = path.substring(rootPath.length());
		}
		
		return path;
	}
	
}
