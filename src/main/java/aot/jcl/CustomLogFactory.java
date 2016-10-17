/*
 * Copyright (C) 2016 Dmitry Kotlyarov.
 * All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package aot.jcl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/**
 * @author Dmitry Kotlyarov
 * @since 1.0
 */
public class CustomLogFactory extends LogFactory {
    public CustomLogFactory() {
    }

    @Override
    public Object getAttribute(String name) {
        return null;
    }

    @Override
    public String[] getAttributeNames() {
        return new String[0];
    }

    @Override
    public Log getInstance(Class clazz) throws LogConfigurationException {
        return null;
    }

    @Override
    public Log getInstance(String name) throws LogConfigurationException {
        return null;
    }

    @Override
    public void release() {

    }

    @Override
    public void removeAttribute(String name) {

    }

    @Override
    public void setAttribute(String name, Object value) {

    }
}
