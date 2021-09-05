/**
 *  Copyright 2012-2017 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.itest.simple;

import java.math.BigDecimal;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mapstruct.itest.externalbeanjar.Source;
import org.mapstruct.itest.externalbeanjar.Issue1121Mapper;
import org.mapstruct.itest.externalbeanjar.Target;

public class ConversionTest {

    @Test
    public void shouldApplyConversions() {
        Source source = new Source();
        source.setBigDecimal( new BigDecimal( "42" ) );

        Target target = Issue1121Mapper.INSTANCE.map( source );

        assertThat( target ).isNotNull();
        assertThat( target.getInteger() ).isEqualTo( 42 );
    }

}
