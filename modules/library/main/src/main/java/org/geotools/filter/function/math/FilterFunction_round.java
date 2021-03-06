/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2005-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.filter.function.math;

// this code is autogenerated - you shouldnt be modifying it!

import static org.geotools.filter.capability.FunctionNameImpl.parameter;

import org.geotools.filter.FunctionExpressionImpl;
import org.geotools.filter.capability.FunctionNameImpl;
import org.opengis.filter.capability.FunctionName;

public class FilterFunction_round extends FunctionExpressionImpl {

    // public static FunctionName NAME = new FunctionNameImpl("round", "float");
    public static FunctionName NAME =
            new FunctionNameImpl(
                    "round", parameter("float", Float.class), parameter("number", Number.class));

    public FilterFunction_round() {
        super(NAME);
    }

    public Object evaluate(Object feature) {
        float arg0;

        try { // attempt to get value and perform conversion
            Number number = getExpression(0).evaluate(feature, Float.class);
            arg0 = number.floatValue();
        } catch (Exception e) {
            // probably a type error
            throw new IllegalArgumentException(
                    "Filter Function problem for function round argument #0 - expected type float");
        }

        return Integer.valueOf(Math.round(arg0));
    }
}
