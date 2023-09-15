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
package com.amazonaws.services.tnb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.tnb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListSolNetworkPackageInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSolNetworkPackageInfoJsonUnmarshaller implements Unmarshaller<ListSolNetworkPackageInfo, JsonUnmarshallerContext> {

    public ListSolNetworkPackageInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListSolNetworkPackageInfo listSolNetworkPackageInfo = new ListSolNetworkPackageInfo();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setMetadata(ListSolNetworkPackageMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nsdDesigner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdDesigner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdInvariantId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdInvariantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdOnboardingState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdOnboardingState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdOperationalState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdOperationalState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdUsageState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdUsageState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nsdVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setNsdVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vnfPkgIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listSolNetworkPackageInfo.setVnfPkgIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
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

        return listSolNetworkPackageInfo;
    }

    private static ListSolNetworkPackageInfoJsonUnmarshaller instance;

    public static ListSolNetworkPackageInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSolNetworkPackageInfoJsonUnmarshaller();
        return instance;
    }
}
