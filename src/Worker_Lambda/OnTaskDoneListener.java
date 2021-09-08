package Worker_Lambda;

@FunctionalInterface
public interface OnTaskDoneListener {

    void onDone(String result);

}
