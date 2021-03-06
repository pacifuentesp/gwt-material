/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui;

import com.google.gwt.dom.client.Document;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.CssName;
//@formatter:off

/**
 * Dividers are 1 pixel lines that help break up your content.
 * <p>
 * <h3>UiBinder Usage:</h3>
 * <pre>
 * {@code
 *  <m:MaterialTitle title="Title" description="Description"/>
 *  <m:MaterialDivider />
 * }
 * </pre>
 *
 * @author kevzlou7979
 * @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#helper">Material Divider</a>
 * @see <a href="https://material.io/guidelines/components/dividers.html#">Material Design Specification</a>
 */
//@formatter:on
public class MaterialDivider extends MaterialWidget {

    public MaterialDivider() {
        super(Document.get().createDivElement(), CssName.DIVIDER);
    }
}