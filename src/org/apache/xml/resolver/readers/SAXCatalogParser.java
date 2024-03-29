// Copyright 2019 Fred Gotwald. Modifications to original.
// SAXCatalogParser.java - An interface for reading catalog files

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.xml.resolver.readers;

import org.apache.xml.resolver.Catalog;
import org.xml.sax.*;

/**
 * The SAXCatalogParser interface.
 *
 * <p>This interface must be implemented in order for a class to
 * participate as a parser for the SAXCatalogReader.
 *
 * @see Catalog
 * @see SAXCatalogReader
 *
 * @author Norman Walsh
 * <a href="mailto:Norman.Walsh@Sun.COM">Norman.Walsh@Sun.COM</a>
 *
 * @version 1.0
 */
public interface SAXCatalogParser extends ContentHandler {
    /** Set the Catalog for which parsing is being performed. */
    public void setCatalog(Catalog catalog);
}
