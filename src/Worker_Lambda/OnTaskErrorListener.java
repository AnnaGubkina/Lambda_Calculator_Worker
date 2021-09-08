package Worker_Lambda;

@FunctionalInterface
public interface OnTaskErrorListener {

    void onError(String result);


}
