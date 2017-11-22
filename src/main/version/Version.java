/** 
 * This package is used for vresioning, and package management. 
 * also a display of how to import a package into a main class.
 * When distributing this application, increment the version number
 * using Semantic Versioning. 
 */

package sample.version;

/** 
 * Contains the version information for the application.
 * 
 * @author Phillip Dudley
 * @version 0.1.0
 * @since 2016-11-18
 */
public class Version {
	/**
	 * Used to store the version number. 
	 * Similar to how Ruby does their versioning.
	 * 
	 * @param none
	 * @return none
	 */
	public void VERSION() {
		String version = "0.1.0";
		System.out.println(version);
	}
}