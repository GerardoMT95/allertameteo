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

package it.eng.allerta.messages.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import it.eng.allerta.messages.services.model.SmsSchedulerContext;
import it.eng.allerta.messages.services.service.SmsSchedulerContextLocalServiceUtil;

/**
 * The extended model base implementation for the SmsSchedulerContext service. Represents a row in the &quot;smsService_SmsSchedulerContext&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SmsSchedulerContextImpl}.
 * </p>
 *
 * @author Giorgianni_F
 * @see SmsSchedulerContextImpl
 * @see SmsSchedulerContext
 * @generated
 */
@ProviderType
public abstract class SmsSchedulerContextBaseImpl
	extends SmsSchedulerContextModelImpl implements SmsSchedulerContext {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sms scheduler context model instance should use the <code>SmsSchedulerContext</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			SmsSchedulerContextLocalServiceUtil.addSmsSchedulerContext(this);
		}
		else {
			SmsSchedulerContextLocalServiceUtil.updateSmsSchedulerContext(this);
		}
	}

}