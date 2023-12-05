package fraudDetection;

import org.apache.flink.annotation.PublicEvolving;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.walkthrough.common.entity.Alert;

@PublicEvolving
public class ALertPrintOut implements SinkFunction<Alert> {
    private static final long serialVersionUID = 1L;

    public ALertPrintOut() {
    }

    public void invoke(Alert value, Context context) {
        System.out.println(value.toString());
    }
}
