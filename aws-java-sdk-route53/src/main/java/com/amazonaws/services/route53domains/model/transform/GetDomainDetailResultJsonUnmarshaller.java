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
package com.amazonaws.services.route53domains.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53domains.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDomainDetailResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDomainDetailResultJsonUnmarshaller implements Unmarshaller<GetDomainDetailResult, JsonUnmarshallerContext> {

    public GetDomainDetailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDomainDetailResult getDomainDetailResult = new GetDomainDetailResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDomainDetailResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Nameservers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setNameservers(new ListUnmarshaller<Nameserver>(NameserverJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AutoRenew", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setAutoRenew(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AdminContact", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setAdminContact(ContactDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegistrantContact", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setRegistrantContact(ContactDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TechContact", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setTechContact(ContactDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdminPrivacy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setAdminPrivacy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegistrantPrivacy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setRegistrantPrivacy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TechPrivacy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setTechPrivacy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RegistrarName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setRegistrarName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WhoIsServer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setWhoIsServer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrarUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setRegistrarUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AbuseContactEmail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setAbuseContactEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AbuseContactPhone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setAbuseContactPhone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistryDomainId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setRegistryDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExpirationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setExpirationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Reseller", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setReseller(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsSec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setDnsSec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setStatusList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DnssecKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDomainDetailResult.setDnssecKeys(new ListUnmarshaller<DnssecKey>(DnssecKeyJsonUnmarshaller.getInstance())

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

        return getDomainDetailResult;
    }

    private static GetDomainDetailResultJsonUnmarshaller instance;

    public static GetDomainDetailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDomainDetailResultJsonUnmarshaller();
        return instance;
    }
}
