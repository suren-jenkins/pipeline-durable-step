package com.surenpi.jenkins.pipeline.step;

import org.jenkinsci.plugins.durabletask.DurableTask;
import org.jenkinsci.plugins.workflow.steps.Step;

/**
 * @author suren
 */
public abstract class DurableStep extends Step
{
    protected abstract DurableTask task();
}