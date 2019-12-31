/**
 *
 * Copyright 2019 paolo mococci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed following in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package local.example.management.user.impl;

import local.example.management.user.User;

public abstract class UserImpl 
	implements User {

	protected static final long ID_DEFAULT = 0L;
	protected static final String NAME_DEFAULT = "John";
	protected static final String SURNAME_DEFAULT = "Do";
	
	protected long id = ID_DEFAULT;
	protected String name = NAME_DEFAULT;
	protected String surname = SURNAME_DEFAULT;

	protected UserImpl() {
		super();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public long getId() {
		return id;
	}
}
