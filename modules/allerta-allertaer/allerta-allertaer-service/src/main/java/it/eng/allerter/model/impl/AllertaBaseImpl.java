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

package it.eng.allerter.model.impl;

import aQute.bnd.annotation.ProviderType;

import it.eng.allerter.model.Allerta;
import it.eng.allerter.service.AllertaLocalServiceUtil;

/**
 * The extended model base implementation for the Allerta service. Represents a row in the &quot;ALLERTER_Allerta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AllertaImpl}.
 * </p>
 *
 * @author GFAVINI
 * @see AllertaImpl
 * @see Allerta
 * @generated
 */
@ProviderType
public abstract class AllertaBaseImpl
	extends AllertaModelImpl implements Allerta {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a allerta model instance should use the <code>Allerta</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			AllertaLocalServiceUtil.addAllerta(this);
		}
		else {
			AllertaLocalServiceUtil.updateAllerta(this);
		}
	}

}