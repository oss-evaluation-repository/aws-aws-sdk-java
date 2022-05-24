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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Required when you use Dolby Vision processing. Set Profile to Profile 5 to only include frame-interleaved Dolby
 * Vision metadata in your output. Set Profile to Profile 8.1 to include both frame-interleaved Dolby Vision metadata
 * and HDR10 metadata in your output.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DolbyVisionProfile {

    PROFILE_5("PROFILE_5"),
    PROFILE_8_1("PROFILE_8_1");

    private String value;

    private DolbyVisionProfile(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DolbyVisionProfile corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DolbyVisionProfile fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DolbyVisionProfile enumEntry : DolbyVisionProfile.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
