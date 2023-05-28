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

package it.eng.parer.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import it.eng.parer.model.DatiSpecificiInvio;
import it.eng.parer.service.base.DatiSpecificiInvioServiceBaseImpl;

/**
 * The implementation of the dati specifici invio remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>it.eng.parer.service.DatiSpecificiInvioService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Pratola_L
 * @see DatiSpecificiInvioServiceBaseImpl
 */
public class DatiSpecificiInvioServiceImpl
	extends DatiSpecificiInvioServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>it.eng.parer.service.DatiSpecificiInvioServiceUtil</code> to access the dati specifici invio remote service.
	 */
	private Log logger = LogFactoryUtil.getLog(DatiSpecificiInvioServiceImpl.class);
	
	public List<DatiSpecificiInvio> listaDatiSpecificiByEsitoInvio(String esitoInvio){
		List<DatiSpecificiInvio> findByesitoInvio = null;
		try {
			findByesitoInvio = datiSpecificiInvioPersistence.findByesitoInvio(esitoInvio);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			logger.error(e);
		}
		return findByesitoInvio;
	}
	
}