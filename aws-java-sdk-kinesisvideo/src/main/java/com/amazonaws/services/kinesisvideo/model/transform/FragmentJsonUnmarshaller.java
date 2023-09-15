/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisvideo.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Fragment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FragmentJsonUnmarshaller implements Unmarshaller<Fragment, JsonUnmarshallerContext> {

    public Fragment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Fragment fragment = new Fragment();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FragmentNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fragment.setFragmentNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FragmentSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fragment.setFragmentSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ProducerTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fragment.setProducerTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ServerTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fragment.setServerTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FragmentLengthInMilliseconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fragment.setFragmentLengthInMilliseconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fragment;
    }

    private static FragmentJsonUnmarshaller instance;

    public static FragmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FragmentJsonUnmarshaller();
        return instance;
    }
}
