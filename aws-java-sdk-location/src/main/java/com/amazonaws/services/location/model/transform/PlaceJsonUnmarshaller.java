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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Place JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlaceJsonUnmarshaller implements Unmarshaller<Place, JsonUnmarshallerContext> {

    public Place unmarshall(JsonUnmarshallerContext context) throws Exception {
        Place place = new Place();

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
                if (context.testExpression("AddressNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setAddressNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Categories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Country", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Geometry", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setGeometry(PlaceGeometryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Interpolated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setInterpolated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Label", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Municipality", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setMunicipality(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Neighborhood", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setNeighborhood(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostalCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setPostalCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Street", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setStreet(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setSubRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupplementalCategories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setSupplementalCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TimeZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setTimeZone(TimeZoneJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UnitNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setUnitNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnitType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    place.setUnitType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return place;
    }

    private static PlaceJsonUnmarshaller instance;

    public static PlaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlaceJsonUnmarshaller();
        return instance;
    }
}
