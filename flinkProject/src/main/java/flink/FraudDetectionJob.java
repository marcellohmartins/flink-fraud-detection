package flinkProject.src.main.java.flink;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvronment;
import org.apache.flink.walkthrough.common.sink.AlertSink;
import org.apache.flink.walkthrough.common.entity.Alert;
import org.apache.flink.walkthrough.common.entity.Transaction;
import org.apache.flink.walkthrough.common.source.TransactionSource;


public class FraudDetectionJob {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<Transaction> transactions = env
                .addSource(new TransactionSource())
                .name('transactions');

        DataStreams<Alert> alerts = transactions
                .keyBy(Transaction::getAccountID)
                .process(new FraudDetector())
                .name("fraud-detector");

        alerts.addSink(new AlertSink()).name("send-alerts");

        env.execute("Fraud Detection")
    }

}
