/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.yang.gen.v1.urn.simple.data.types.rev20131112.simpledatatypes.cont;

import java.util.Objects;
import com.google.common.base.MoreObjects;

/**
 * Represents the implementation of lfunion8Union.
 */
public final class Lfunion8Union {

    private int uint16;
    private String string;

    /**
     * Creates an instance of lfunion8Union.
     */
    private Lfunion8Union() {
    }

    /**
     * Creates an instance of lfunion8UnionForTypeUint16.
     *
     * @param value value of lfunion8UnionForTypeUint16
     */
    public Lfunion8Union(int value) {
        this.uint16 = value;
    }

    /**
     * Creates an instance of lfunion8UnionForTypeString.
     *
     * @param value value of lfunion8UnionForTypeString
     */
    public Lfunion8Union(String value) {
        this.string = value;
    }

    /**
     * Returns the object of lfunion8UnionForTypeUint16.
     *
     * @param value value of lfunion8UnionForTypeUint16
     * @return Object of lfunion8UnionForTypeUint16
     */
    public static Lfunion8Union of(int value) {
        return new Lfunion8Union(value);
    }

    /**
     * Returns the object of lfunion8UnionForTypeString.
     *
     * @param value value of lfunion8UnionForTypeString
     * @return Object of lfunion8UnionForTypeString
     */
    public static Lfunion8Union of(String value) {
        return new Lfunion8Union(value);
    }

    /**
     * Returns the attribute uint16.
     *
     * @return value of uint16
     */
    public int uint16() {
        return uint16;
    }

    /**
     * Returns the attribute string.
     *
     * @return value of string
     */
    public String string() {
        return string;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uint16, string);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lfunion8Union) {
            Lfunion8Union other = (Lfunion8Union) obj;
            return
                 Objects.equals(uint16, other.uint16) &&
                 Objects.equals(string, other.string);
        }
        return false;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(getClass())
            .omitNullValues()
            .add("uint16", uint16)
            .add("string", string)
            .toString();
    }

    /**
     * Returns the object of lfunion8Union fromString input String.
     *
     * @param valInString input String
     * @return Object of lfunion8Union
     */
    public static Lfunion8Union fromString(String valInString) {
        try {
            int tmpVal = Integer.parseInt(valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        try {
            String tmpVal = (valInString);
            return of(tmpVal);
        } catch (Exception e) {
        }
        return null;
    }
}