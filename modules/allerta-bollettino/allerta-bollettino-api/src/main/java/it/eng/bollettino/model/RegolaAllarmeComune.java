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

package it.eng.bollettino.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the RegolaAllarmeComune service. Represents a row in the &quot;BOLLETTINO_RegolaAllarmeComune&quot; database table, with each column mapped to a property of this class.
 *
 * @author GFAVINI
 * @see RegolaAllarmeComuneModel
 * @generated
 */
@ImplementationClassName("it.eng.bollettino.model.impl.RegolaAllarmeComuneImpl")
@ProviderType
public interface RegolaAllarmeComune
	extends PersistedModel, RegolaAllarmeComuneModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>it.eng.bollettino.model.impl.RegolaAllarmeComuneImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RegolaAllarmeComune, Long> ID_ACCESSOR =
		new Accessor<RegolaAllarmeComune, Long>() {

			@Override
			public Long get(RegolaAllarmeComune regolaAllarmeComune) {
				return regolaAllarmeComune.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RegolaAllarmeComune> getTypeClass() {
				return RegolaAllarmeComune.class;
			}

		};

}