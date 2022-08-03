/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The device-remembering configuration for a user pool. A null value indicates that you have deactivated device
 * remembering in your user pool.
 * </p>
 * <note>
 * <p>
 * When you provide a value for any <code>DeviceConfiguration</code> field, you activate the Amazon Cognito
 * device-remembering feature.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/DeviceConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for multi-factor
     * authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     * remembered must provide a second factor if your user pool requires MFA.
     * </p>
     * </note>
     */
    private Boolean challengeRequiredOnNewDevice;
    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with their
     * device can instead opt in to remembering their device. To collect a choice from your user, create an input prompt
     * in your app and return the value that the user chooses in an <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     */
    private Boolean deviceOnlyRememberedOnUserPrompt;

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for multi-factor
     * authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     * remembered must provide a second factor if your user pool requires MFA.
     * </p>
     * </note>
     * 
     * @param challengeRequiredOnNewDevice
     *        When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for
     *        multi-factor authentication (MFA).</p> <note>
     *        <p>
     *        Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     *        remembered must provide a second factor if your user pool requires MFA.
     *        </p>
     */

    public void setChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for multi-factor
     * authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     * remembered must provide a second factor if your user pool requires MFA.
     * </p>
     * </note>
     * 
     * @return When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for
     *         multi-factor authentication (MFA).</p> <note>
     *         <p>
     *         Regardless of the value of this field, users that sign in with new devices that have not been confirmed
     *         or remembered must provide a second factor if your user pool requires MFA.
     *         </p>
     */

    public Boolean getChallengeRequiredOnNewDevice() {
        return this.challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for multi-factor
     * authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     * remembered must provide a second factor if your user pool requires MFA.
     * </p>
     * </note>
     * 
     * @param challengeRequiredOnNewDevice
     *        When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for
     *        multi-factor authentication (MFA).</p> <note>
     *        <p>
     *        Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     *        remembered must provide a second factor if your user pool requires MFA.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceConfigurationType withChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        setChallengeRequiredOnNewDevice(challengeRequiredOnNewDevice);
        return this;
    }

    /**
     * <p>
     * When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for multi-factor
     * authentication (MFA).
     * </p>
     * <note>
     * <p>
     * Regardless of the value of this field, users that sign in with new devices that have not been confirmed or
     * remembered must provide a second factor if your user pool requires MFA.
     * </p>
     * </note>
     * 
     * @return When true, device authentication can replace SMS and time-based one-time password (TOTP) factors for
     *         multi-factor authentication (MFA).</p> <note>
     *         <p>
     *         Regardless of the value of this field, users that sign in with new devices that have not been confirmed
     *         or remembered must provide a second factor if your user pool requires MFA.
     *         </p>
     */

    public Boolean isChallengeRequiredOnNewDevice() {
        return this.challengeRequiredOnNewDevice;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with their
     * device can instead opt in to remembering their device. To collect a choice from your user, create an input prompt
     * in your app and return the value that the user chooses in an <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     * 
     * @param deviceOnlyRememberedOnUserPrompt
     *        When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with
     *        their device can instead opt in to remembering their device. To collect a choice from your user, create an
     *        input prompt in your app and return the value that the user chooses in an <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *        >UpdateDeviceStatus</a> API request.
     */

    public void setDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with their
     * device can instead opt in to remembering their device. To collect a choice from your user, create an input prompt
     * in your app and return the value that the user chooses in an <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     * 
     * @return When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with
     *         their device can instead opt in to remembering their device. To collect a choice from your user, create
     *         an input prompt in your app and return the value that the user chooses in an <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *         >UpdateDeviceStatus</a> API request.
     */

    public Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return this.deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with their
     * device can instead opt in to remembering their device. To collect a choice from your user, create an input prompt
     * in your app and return the value that the user chooses in an <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     * 
     * @param deviceOnlyRememberedOnUserPrompt
     *        When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with
     *        their device can instead opt in to remembering their device. To collect a choice from your user, create an
     *        input prompt in your app and return the value that the user chooses in an <a href=
     *        "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *        >UpdateDeviceStatus</a> API request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeviceConfigurationType withDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        setDeviceOnlyRememberedOnUserPrompt(deviceOnlyRememberedOnUserPrompt);
        return this;
    }

    /**
     * <p>
     * When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with their
     * device can instead opt in to remembering their device. To collect a choice from your user, create an input prompt
     * in your app and return the value that the user chooses in an <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     * >UpdateDeviceStatus</a> API request.
     * </p>
     * 
     * @return When true, Amazon Cognito doesn't remember newly-confirmed devices. Users who want to authenticate with
     *         their device can instead opt in to remembering their device. To collect a choice from your user, create
     *         an input prompt in your app and return the value that the user chooses in an <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html"
     *         >UpdateDeviceStatus</a> API request.
     */

    public Boolean isDeviceOnlyRememberedOnUserPrompt() {
        return this.deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChallengeRequiredOnNewDevice() != null)
            sb.append("ChallengeRequiredOnNewDevice: ").append(getChallengeRequiredOnNewDevice()).append(",");
        if (getDeviceOnlyRememberedOnUserPrompt() != null)
            sb.append("DeviceOnlyRememberedOnUserPrompt: ").append(getDeviceOnlyRememberedOnUserPrompt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceConfigurationType == false)
            return false;
        DeviceConfigurationType other = (DeviceConfigurationType) obj;
        if (other.getChallengeRequiredOnNewDevice() == null ^ this.getChallengeRequiredOnNewDevice() == null)
            return false;
        if (other.getChallengeRequiredOnNewDevice() != null && other.getChallengeRequiredOnNewDevice().equals(this.getChallengeRequiredOnNewDevice()) == false)
            return false;
        if (other.getDeviceOnlyRememberedOnUserPrompt() == null ^ this.getDeviceOnlyRememberedOnUserPrompt() == null)
            return false;
        if (other.getDeviceOnlyRememberedOnUserPrompt() != null
                && other.getDeviceOnlyRememberedOnUserPrompt().equals(this.getDeviceOnlyRememberedOnUserPrompt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChallengeRequiredOnNewDevice() == null) ? 0 : getChallengeRequiredOnNewDevice().hashCode());
        hashCode = prime * hashCode + ((getDeviceOnlyRememberedOnUserPrompt() == null) ? 0 : getDeviceOnlyRememberedOnUserPrompt().hashCode());
        return hashCode;
    }

    @Override
    public DeviceConfigurationType clone() {
        try {
            return (DeviceConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.DeviceConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
