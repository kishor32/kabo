
/*Copyright [2017] [Kishor Jyoti Sarma]

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.*/

package com.kabo.core.behavior;

import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import java.util.List;

public class TestRunner {

    public void runTests(final long timeOut,StepDefinition... stepDefinitions){
        JBehaveSettings jBehaveSettings = new JBehaveSettings();
        jBehaveSettings.setEmbedder(timeOut, stepDefinitions);
        List<String>s=new StoryFinder ( ).
                findPaths ( CodeLocations.codeLocationFromClass(this.getClass()),
                        "**/*.story", null );
        jBehaveSettings.getEmbedder().runStoriesAsPaths(s);

    }

}
