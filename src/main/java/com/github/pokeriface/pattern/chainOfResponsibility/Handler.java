package com.github.pokeriface.pattern.chainOfResponsibility;

public abstract class Handler {
    private Handler next;

    public final Response handleMessage(Request request) {
        if (this.getLevel().equals(request.getLevel())) {
            return echo(request);
        } else {
            if (null != this.next) {
                return this.next.echo(request);
            } else {
                //do something else
                return null;
            }
        }
    }

    public Handler setNext(Handler handler) {
        this.next = handler;
        return this;
    }

    protected abstract Level getLevel();

    protected abstract Response echo(Request request);
}
