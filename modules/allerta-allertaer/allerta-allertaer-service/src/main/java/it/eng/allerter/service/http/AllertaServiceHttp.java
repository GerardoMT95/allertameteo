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

package it.eng.allerter.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import it.eng.allerter.service.AllertaServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>AllertaServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author GFAVINI
 * @see AllertaServiceSoap
 * @generated
 */
@ProviderType
public class AllertaServiceHttp {

	public static java.util.ArrayList<java.util.Map<String, String>>
		getStatoAllertaDays(HttpPrincipal httpPrincipal, int giorni) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getStatoAllertaDays",
				_getStatoAllertaDaysParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, giorni);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.ArrayList<java.util.Map<String, String>>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.ArrayList<java.util.Map<String, String>>
		getStatoAllerta(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getStatoAllerta",
				_getStatoAllertaParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.ArrayList<java.util.Map<String, String>>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.ArrayList<java.util.Map<String, String>>
		getStatoAllertaDomani(HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getStatoAllertaDomani",
				_getStatoAllertaDomaniParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.ArrayList<java.util.Map<String, String>>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.Map<String, Object> getStatoAllertaPrimes(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getStatoAllertaPrimes",
				_getStatoAllertaPrimesParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.Map<String, Object> getStatoAllertaPrimesDomani(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getStatoAllertaPrimesDomani",
				_getStatoAllertaPrimesDomaniParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.Map<String, Object> getInfoAllerta(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getInfoAllerta",
				_getInfoAllertaParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.Map<String, Object> getInfoAllertaDomani(
		HttpPrincipal httpPrincipal) {

		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getInfoAllertaDomani",
				_getInfoAllertaDomaniParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return (java.util.Map<String, Object>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static long getIdApprovatore(HttpPrincipal httpPrincipal, long id) {
		try {
			MethodKey methodKey = new MethodKey(
				AllertaServiceUtil.class, "getIdApprovatore",
				_getIdApprovatoreParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					e);
			}

			return ((Long)returnObj).longValue();
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(AllertaServiceHttp.class);

	private static final Class<?>[] _getStatoAllertaDaysParameterTypes2 =
		new Class[] {int.class};
	private static final Class<?>[] _getStatoAllertaParameterTypes3 =
		new Class[] {};
	private static final Class<?>[] _getStatoAllertaDomaniParameterTypes4 =
		new Class[] {};
	private static final Class<?>[] _getStatoAllertaPrimesParameterTypes5 =
		new Class[] {};
	private static final Class<?>[]
		_getStatoAllertaPrimesDomaniParameterTypes6 = new Class[] {};
	private static final Class<?>[] _getInfoAllertaParameterTypes7 =
		new Class[] {};
	private static final Class<?>[] _getInfoAllertaDomaniParameterTypes8 =
		new Class[] {};
	private static final Class<?>[] _getIdApprovatoreParameterTypes9 =
		new Class[] {long.class};

}