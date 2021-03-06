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

package com.liferay.commerce.discount.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the CommerceDiscountRule service. Represents a row in the &quot;CommerceDiscountRule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.commerce.discount.model.impl.CommerceDiscountRuleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.commerce.discount.model.impl.CommerceDiscountRuleImpl}.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceDiscountRule
 * @see com.liferay.commerce.discount.model.impl.CommerceDiscountRuleImpl
 * @see com.liferay.commerce.discount.model.impl.CommerceDiscountRuleModelImpl
 * @generated
 */
@ProviderType
public interface CommerceDiscountRuleModel extends BaseModel<CommerceDiscountRule>,
	GroupedModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce discount rule model instance should use the {@link CommerceDiscountRule} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce discount rule.
	 *
	 * @return the primary key of this commerce discount rule
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce discount rule.
	 *
	 * @param primaryKey the primary key of this commerce discount rule
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the commerce discount rule ID of this commerce discount rule.
	 *
	 * @return the commerce discount rule ID of this commerce discount rule
	 */
	public long getCommerceDiscountRuleId();

	/**
	 * Sets the commerce discount rule ID of this commerce discount rule.
	 *
	 * @param commerceDiscountRuleId the commerce discount rule ID of this commerce discount rule
	 */
	public void setCommerceDiscountRuleId(long commerceDiscountRuleId);

	/**
	 * Returns the group ID of this commerce discount rule.
	 *
	 * @return the group ID of this commerce discount rule
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this commerce discount rule.
	 *
	 * @param groupId the group ID of this commerce discount rule
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this commerce discount rule.
	 *
	 * @return the company ID of this commerce discount rule
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce discount rule.
	 *
	 * @param companyId the company ID of this commerce discount rule
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce discount rule.
	 *
	 * @return the user ID of this commerce discount rule
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce discount rule.
	 *
	 * @param userId the user ID of this commerce discount rule
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce discount rule.
	 *
	 * @return the user uuid of this commerce discount rule
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce discount rule.
	 *
	 * @param userUuid the user uuid of this commerce discount rule
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce discount rule.
	 *
	 * @return the user name of this commerce discount rule
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce discount rule.
	 *
	 * @param userName the user name of this commerce discount rule
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce discount rule.
	 *
	 * @return the create date of this commerce discount rule
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce discount rule.
	 *
	 * @param createDate the create date of this commerce discount rule
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce discount rule.
	 *
	 * @return the modified date of this commerce discount rule
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce discount rule.
	 *
	 * @param modifiedDate the modified date of this commerce discount rule
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the commerce discount ID of this commerce discount rule.
	 *
	 * @return the commerce discount ID of this commerce discount rule
	 */
	public long getCommerceDiscountId();

	/**
	 * Sets the commerce discount ID of this commerce discount rule.
	 *
	 * @param commerceDiscountId the commerce discount ID of this commerce discount rule
	 */
	public void setCommerceDiscountId(long commerceDiscountId);

	/**
	 * Returns the type of this commerce discount rule.
	 *
	 * @return the type of this commerce discount rule
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this commerce discount rule.
	 *
	 * @param type the type of this commerce discount rule
	 */
	public void setType(String type);

	/**
	 * Returns the type settings of this commerce discount rule.
	 *
	 * @return the type settings of this commerce discount rule
	 */
	@AutoEscape
	public String getTypeSettings();

	/**
	 * Sets the type settings of this commerce discount rule.
	 *
	 * @param typeSettings the type settings of this commerce discount rule
	 */
	public void setTypeSettings(String typeSettings);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(CommerceDiscountRule commerceDiscountRule);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CommerceDiscountRule> toCacheModel();

	@Override
	public CommerceDiscountRule toEscapedModel();

	@Override
	public CommerceDiscountRule toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}