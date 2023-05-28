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

package it.eng.bollettino.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import it.eng.bollettino.model.BollettinoIcona;
import it.eng.bollettino.model.BollettinoIconaModel;
import it.eng.bollettino.model.BollettinoIconaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the BollettinoIcona service. Represents a row in the &quot;BOLLETTINO_BollettinoIcona&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>BollettinoIconaModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BollettinoIconaImpl}.
 * </p>
 *
 * @author GFAVINI
 * @see BollettinoIconaImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class BollettinoIconaModelImpl
	extends BaseModelImpl<BollettinoIcona> implements BollettinoIconaModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a bollettino icona model instance should use the <code>BollettinoIcona</code> interface instead.
	 */
	public static final String TABLE_NAME = "BOLLETTINO_BollettinoIcona";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"id_", Types.BIGINT},
		{"idBollettino", Types.BIGINT}, {"idIcona", Types.BIGINT},
		{"x", Types.DOUBLE}, {"y", Types.DOUBLE}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("idBollettino", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("idIcona", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("x", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("y", Types.DOUBLE);
	}

	public static final String TABLE_SQL_CREATE =
		"create table BOLLETTINO_BollettinoIcona (uuid_ VARCHAR(75) null,id_ LONG not null primary key,idBollettino LONG,idIcona LONG,x DOUBLE,y DOUBLE)";

	public static final String TABLE_SQL_DROP =
		"drop table BOLLETTINO_BollettinoIcona";

	public static final String ORDER_BY_JPQL =
		" ORDER BY bollettinoIcona.id ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY BOLLETTINO_BollettinoIcona.id_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		allerta.bollettino.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.it.eng.bollettino.model.BollettinoIcona"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		allerta.bollettino.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.it.eng.bollettino.model.BollettinoIcona"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		allerta.bollettino.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.it.eng.bollettino.model.BollettinoIcona"),
		true);

	public static final long IDBOLLETTINO_COLUMN_BITMASK = 1L;

	public static final long UUID_COLUMN_BITMASK = 2L;

	public static final long ID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static BollettinoIcona toModel(BollettinoIconaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		BollettinoIcona model = new BollettinoIconaImpl();

		model.setUuid(soapModel.getUuid());
		model.setId(soapModel.getId());
		model.setIdBollettino(soapModel.getIdBollettino());
		model.setIdIcona(soapModel.getIdIcona());
		model.setX(soapModel.getX());
		model.setY(soapModel.getY());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<BollettinoIcona> toModels(
		BollettinoIconaSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<BollettinoIcona> models = new ArrayList<BollettinoIcona>(
			soapModels.length);

		for (BollettinoIconaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		allerta.bollettino.service.util.ServiceProps.get(
			"lock.expiration.time.it.eng.bollettino.model.BollettinoIcona"));

	public BollettinoIconaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return BollettinoIcona.class;
	}

	@Override
	public String getModelClassName() {
		return BollettinoIcona.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<BollettinoIcona, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<BollettinoIcona, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<BollettinoIcona, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((BollettinoIcona)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<BollettinoIcona, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<BollettinoIcona, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(BollettinoIcona)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<BollettinoIcona, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<BollettinoIcona, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<BollettinoIcona, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<BollettinoIcona, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<BollettinoIcona, Object>>
			attributeGetterFunctions =
				new LinkedHashMap<String, Function<BollettinoIcona, Object>>();
		Map<String, BiConsumer<BollettinoIcona, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<BollettinoIcona, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<BollettinoIcona, Object>() {

				@Override
				public Object apply(BollettinoIcona bollettinoIcona) {
					return bollettinoIcona.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<BollettinoIcona, Object>() {

				@Override
				public void accept(
					BollettinoIcona bollettinoIcona, Object uuid) {

					bollettinoIcona.setUuid((String)uuid);
				}

			});
		attributeGetterFunctions.put(
			"id",
			new Function<BollettinoIcona, Object>() {

				@Override
				public Object apply(BollettinoIcona bollettinoIcona) {
					return bollettinoIcona.getId();
				}

			});
		attributeSetterBiConsumers.put(
			"id",
			new BiConsumer<BollettinoIcona, Object>() {

				@Override
				public void accept(BollettinoIcona bollettinoIcona, Object id) {
					bollettinoIcona.setId((Long)id);
				}

			});
		attributeGetterFunctions.put(
			"idBollettino",
			new Function<BollettinoIcona, Object>() {

				@Override
				public Object apply(BollettinoIcona bollettinoIcona) {
					return bollettinoIcona.getIdBollettino();
				}

			});
		attributeSetterBiConsumers.put(
			"idBollettino",
			new BiConsumer<BollettinoIcona, Object>() {

				@Override
				public void accept(
					BollettinoIcona bollettinoIcona, Object idBollettino) {

					bollettinoIcona.setIdBollettino((Long)idBollettino);
				}

			});
		attributeGetterFunctions.put(
			"idIcona",
			new Function<BollettinoIcona, Object>() {

				@Override
				public Object apply(BollettinoIcona bollettinoIcona) {
					return bollettinoIcona.getIdIcona();
				}

			});
		attributeSetterBiConsumers.put(
			"idIcona",
			new BiConsumer<BollettinoIcona, Object>() {

				@Override
				public void accept(
					BollettinoIcona bollettinoIcona, Object idIcona) {

					bollettinoIcona.setIdIcona((Long)idIcona);
				}

			});
		attributeGetterFunctions.put(
			"x",
			new Function<BollettinoIcona, Object>() {

				@Override
				public Object apply(BollettinoIcona bollettinoIcona) {
					return bollettinoIcona.getX();
				}

			});
		attributeSetterBiConsumers.put(
			"x",
			new BiConsumer<BollettinoIcona, Object>() {

				@Override
				public void accept(BollettinoIcona bollettinoIcona, Object x) {
					bollettinoIcona.setX((Double)x);
				}

			});
		attributeGetterFunctions.put(
			"y",
			new Function<BollettinoIcona, Object>() {

				@Override
				public Object apply(BollettinoIcona bollettinoIcona) {
					return bollettinoIcona.getY();
				}

			});
		attributeSetterBiConsumers.put(
			"y",
			new BiConsumer<BollettinoIcona, Object>() {

				@Override
				public void accept(BollettinoIcona bollettinoIcona, Object y) {
					bollettinoIcona.setY((Double)y);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_columnBitmask = -1L;

		_id = id;
	}

	@JSON
	@Override
	public long getIdBollettino() {
		return _idBollettino;
	}

	@Override
	public void setIdBollettino(long idBollettino) {
		_columnBitmask |= IDBOLLETTINO_COLUMN_BITMASK;

		if (!_setOriginalIdBollettino) {
			_setOriginalIdBollettino = true;

			_originalIdBollettino = _idBollettino;
		}

		_idBollettino = idBollettino;
	}

	public long getOriginalIdBollettino() {
		return _originalIdBollettino;
	}

	@JSON
	@Override
	public long getIdIcona() {
		return _idIcona;
	}

	@Override
	public void setIdIcona(long idIcona) {
		_idIcona = idIcona;
	}

	@JSON
	@Override
	public double getX() {
		return _x;
	}

	@Override
	public void setX(double x) {
		_x = x;
	}

	@JSON
	@Override
	public double getY() {
		return _y;
	}

	@Override
	public void setY(double y) {
		_y = y;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, BollettinoIcona.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public BollettinoIcona toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (BollettinoIcona)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		BollettinoIconaImpl bollettinoIconaImpl = new BollettinoIconaImpl();

		bollettinoIconaImpl.setUuid(getUuid());
		bollettinoIconaImpl.setId(getId());
		bollettinoIconaImpl.setIdBollettino(getIdBollettino());
		bollettinoIconaImpl.setIdIcona(getIdIcona());
		bollettinoIconaImpl.setX(getX());
		bollettinoIconaImpl.setY(getY());

		bollettinoIconaImpl.resetOriginalValues();

		return bollettinoIconaImpl;
	}

	@Override
	public int compareTo(BollettinoIcona bollettinoIcona) {
		int value = 0;

		if (getId() < bollettinoIcona.getId()) {
			value = -1;
		}
		else if (getId() > bollettinoIcona.getId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof BollettinoIcona)) {
			return false;
		}

		BollettinoIcona bollettinoIcona = (BollettinoIcona)obj;

		long primaryKey = bollettinoIcona.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		BollettinoIconaModelImpl bollettinoIconaModelImpl = this;

		bollettinoIconaModelImpl._originalUuid = bollettinoIconaModelImpl._uuid;

		bollettinoIconaModelImpl._originalIdBollettino =
			bollettinoIconaModelImpl._idBollettino;

		bollettinoIconaModelImpl._setOriginalIdBollettino = false;

		bollettinoIconaModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<BollettinoIcona> toCacheModel() {
		BollettinoIconaCacheModel bollettinoIconaCacheModel =
			new BollettinoIconaCacheModel();

		bollettinoIconaCacheModel.uuid = getUuid();

		String uuid = bollettinoIconaCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			bollettinoIconaCacheModel.uuid = null;
		}

		bollettinoIconaCacheModel.id = getId();

		bollettinoIconaCacheModel.idBollettino = getIdBollettino();

		bollettinoIconaCacheModel.idIcona = getIdIcona();

		bollettinoIconaCacheModel.x = getX();

		bollettinoIconaCacheModel.y = getY();

		return bollettinoIconaCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<BollettinoIcona, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<BollettinoIcona, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<BollettinoIcona, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((BollettinoIcona)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<BollettinoIcona, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<BollettinoIcona, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<BollettinoIcona, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((BollettinoIcona)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		BollettinoIcona.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		BollettinoIcona.class, ModelWrapper.class
	};

	private String _uuid;
	private String _originalUuid;
	private long _id;
	private long _idBollettino;
	private long _originalIdBollettino;
	private boolean _setOriginalIdBollettino;
	private long _idIcona;
	private double _x;
	private double _y;
	private long _columnBitmask;
	private BollettinoIcona _escapedModel;

}