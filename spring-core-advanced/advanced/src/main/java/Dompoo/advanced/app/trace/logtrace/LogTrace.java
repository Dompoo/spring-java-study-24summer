package Dompoo.advanced.app.trace.logtrace;

import Dompoo.advanced.app.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);
}
