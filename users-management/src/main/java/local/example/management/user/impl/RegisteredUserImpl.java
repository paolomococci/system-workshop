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

import local.example.management.user.RegisteredUser;

public class RegisteredUserImpl 
	extends UserImpl 
	implements RegisteredUser {

	protected static final float REPUTATION_DEFAULT = 0.0F;
	protected float reputation = REPUTATION_DEFAULT;

	protected RegisteredUserImpl() {
		super();
	}

	@Override
	public float getReputation() {
		return reputation;
	}

	@Override
	public void promoteUser() {
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public void acceptUser() {
		// TODO
		throw new UnsupportedOperationException();
	}

	@Override
	public void setReputation(float value) {
		// TODO		
	}

	@Override
	public void setId(long value) {
		// TODO		
	}

	@Override
	public void setName(String value) {
		// TODO
	}

	@Override
	public void setSurname(String value) {
		// TODO
	}
}
