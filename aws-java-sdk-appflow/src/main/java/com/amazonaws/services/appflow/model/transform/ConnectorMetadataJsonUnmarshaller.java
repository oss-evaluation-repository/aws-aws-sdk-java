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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConnectorMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorMetadataJsonUnmarshaller implements Unmarshaller<ConnectorMetadata, JsonUnmarshallerContext> {

    public ConnectorMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorMetadata connectorMetadata = new ConnectorMetadata();

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
                if (context.testExpression("Amplitude", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setAmplitude(AmplitudeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Datadog", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setDatadog(DatadogMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Dynatrace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setDynatrace(DynatraceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GoogleAnalytics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setGoogleAnalytics(GoogleAnalyticsMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InforNexus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setInforNexus(InforNexusMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Marketo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setMarketo(MarketoMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Redshift", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setRedshift(RedshiftMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setS3(S3MetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Salesforce", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setSalesforce(SalesforceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceNow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setServiceNow(ServiceNowMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Singular", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setSingular(SingularMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Slack", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setSlack(SlackMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Snowflake", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setSnowflake(SnowflakeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Trendmicro", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setTrendmicro(TrendmicroMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Veeva", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setVeeva(VeevaMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Zendesk", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setZendesk(ZendeskMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventBridge", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setEventBridge(EventBridgeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Upsolver", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setUpsolver(UpsolverMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomerProfiles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setCustomerProfiles(CustomerProfilesMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Honeycode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setHoneycode(HoneycodeMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SAPOData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setSAPOData(SAPODataMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Pardot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorMetadata.setPardot(PardotMetadataJsonUnmarshaller.getInstance().unmarshall(context));
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

        return connectorMetadata;
    }

    private static ConnectorMetadataJsonUnmarshaller instance;

    public static ConnectorMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorMetadataJsonUnmarshaller();
        return instance;
    }
}
