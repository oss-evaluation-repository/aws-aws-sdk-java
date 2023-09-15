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
package com.amazonaws.services.outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetSiteAddressResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSiteAddressResultJsonUnmarshaller implements Unmarshaller<GetSiteAddressResult, JsonUnmarshallerContext> {

    public GetSiteAddressResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetSiteAddressResult getSiteAddressResult = new GetSiteAddressResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getSiteAddressResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SiteId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getSiteAddressResult.setSiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getSiteAddressResult.setAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Address", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getSiteAddressResult.setAddress(AddressJsonUnmarshaller.getInstance().unmarshall(context));
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

        return getSiteAddressResult;
    }

    private static GetSiteAddressResultJsonUnmarshaller instance;

    public static GetSiteAddressResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetSiteAddressResultJsonUnmarshaller();
        return instance;
    }
}
