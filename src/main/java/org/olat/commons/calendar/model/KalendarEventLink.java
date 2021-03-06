/**
 * OLAT - Online Learning and Training<br>
 * http://www.olat.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Copyright (c) since 2004 at Multimedia- & E-Learning Services (MELS),<br>
 * University of Zurich, Switzerland.
 * <p>
 */

package org.olat.commons.calendar.model;

public class KalendarEventLink {

	private String provider, id, displayName, URI, iconCssClass;

	private KalendarEventLink() {
		// no-args constructor for XStream
	}

	public KalendarEventLink(final String provider, final String id, final String displayName, final String URI, final String iconCssClass) {
		this.provider = provider;
		this.id = id;
		this.displayName = displayName;
		this.URI = URI;
		this.iconCssClass = iconCssClass;
	}

	/**
	 * @return Returns the displayName.
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName The displayName to set.
	 */
	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return Returns the uRI.
	 */
	public String getURI() {
		return URI;
	}

	/**
	 * @param uri The uRI to set.
	 */
	public void setURI(final String uri) {
		URI = uri;
	}

	/**
	 * @return Returns the id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return Returns the provider.
	 */
	public String getProvider() {
		return provider;
	}

	/**
	 * @param provider The provider to set.
	 */
	public void setProvider(final String provider) {
		this.provider = provider;
	}

	/**
	 * @param id The id to set.
	 */
	public void setId(final String id) {
		this.id = id;
	}

	/**
	 * Optional CSS icon class
	 * 
	 * @param iconCssClass
	 */
	public void setIconCssClass(final String iconCssClass) {
		this.iconCssClass = iconCssClass;
	}

	/**
	 * Optional CSS icon class
	 * 
	 * @return iconCssClass
	 */
	public String getIconCssClass() {
		return iconCssClass;
	}

}
