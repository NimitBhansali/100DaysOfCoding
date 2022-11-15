<b>------------------RUNNABLE INTERFACE--------------- <b>
<br>Instantiate the Thread class and pass the implementer to the Thread, Thread has a constructor which accepts Runnable instances.
<br>Invoke start() of Thread instance, start internally calls run() of the implementer. Invoking start() creates a new Thread that executes the code written in run().
<br>Calling run() directly doesn’t create and start a new Thread, it will run in the same thread. To start a new line of execution, call start() on the thread.
