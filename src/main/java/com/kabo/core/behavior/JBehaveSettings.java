package com.kabo.core.behavior;


import com.kabo.core.exception.KaboException;
import org.jbehave.core.ConfigurableEmbedder;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.embedder.EmbedderControls;
import org.jbehave.core.embedder.StoryTimeouts;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.steps.InstanceStepsFactory;

public final class JBehaveSettings extends ConfigurableEmbedder{

    private final Embedder embedder = new Embedder ( );

    /**
     *
     * @param timeOutInSeconds Override JBehave's default story timeout
     */
    private StoryTimeouts.TimeoutParser addStoryTimeOut(final long timeOutInSeconds) {
        StoryTimeouts.TimeoutParser t = new StoryTimeouts.TimeoutParser() {
            public boolean isValid(String timeout) {
                return true;
            }
            public long asSeconds(String timeout) {
                return timeOutInSeconds;
            }
        };
       return t;
    }

    private EmbedderControls setControls(){
        final EmbedderControls embedderControls = new EmbedderControls ( );
        embedderControls.ignoreFailureInStories ();
        embedderControls.doVerboseFailures (false);
        embedderControls.ignoreFailureInView ( );
        embedderControls.useThreads (1);
        embedderControls.failOnStoryTimeout ();
        return embedderControls;
    }

    @Override
    public Configuration configuration () {

        return new MostUsefulConfiguration()
                .useStoryLoader (new LoadFromClasspath(this.getClass()));
    }

    public Embedder getEmbedder() {
        return embedder;
    }

    public void setEmbedder(final long timeOutInSeconds, StepDefinition... stepDefinitions){
        if(timeOutInSeconds>0){
            embedder.useTimeoutParsers(this.addStoryTimeOut(timeOutInSeconds));
        }
        embedder.useEmbedderControls(this.setControls());
        final Configuration configuration = configuration ();
        embedder.useConfiguration(configuration);
        if(stepDefinitions.length==0){
            throw new KaboException("No Step Definition found");
        }
        InstanceStepsFactory instanceStepsFactory = new InstanceStepsFactory(configuration(),stepDefinitions);
        embedder.useStepsFactory(instanceStepsFactory);

    }

    public void run() throws Throwable {

    }
}
