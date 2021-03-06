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
package org.olat.core.commons.scheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Description:<br>
 * dummy job that does nothing. Used in spring in cluster mode for services that only run on one node and on the others just the dummy job is called
 * <P>
 * Initial Date: 09.09.2008 <br>
 * 
 * @author guido
 */
public class DummyJob extends JobWithDB {

	/**
	 * @see org.springframework.scheduling.quartz.QuartzJobBean#executeInternal(org.quartz.JobExecutionContext)
	 */
	@SuppressWarnings("unused")
	@Override
	public void executeWithDB(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("dummy job called...");
	}

}
