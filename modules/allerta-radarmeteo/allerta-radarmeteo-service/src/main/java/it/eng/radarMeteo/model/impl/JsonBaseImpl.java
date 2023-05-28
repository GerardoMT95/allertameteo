/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package it.eng.radarMeteo.model.impl;

import aQute.bnd.annotation.ProviderType;

import it.eng.radarMeteo.model.Json;
import it.eng.radarMeteo.service.JsonLocalServiceUtil;

/**
 * The extended model base implementation for the Json service. Represents a row in the &quot;rt_portlet_json&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JsonImpl}.
 * </p>
 *
 * @author Francesco
 * @see JsonImpl
 * @see Json
 * @generated
 */
@ProviderType
public abstract class JsonBaseImpl extends JsonModelImpl implements Json {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a json model instance should use the <code>Json</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			JsonLocalServiceUtil.addJson(this);
		}
		else {
			JsonLocalServiceUtil.updateJson(this);
		}
	}

}