Java Thread
---------------


Thread are light weight process.

Threads consumes CPU in best possible manner

Reduces idle time of CPU and improves performance

Process can have multiple Threads.

Threads internally maintains their own stacks

Thread Create by two way 

1. Extends Thread class

2. implements Runnable

---------


Thread Life cycle
-----------------

1. new
 
2. runnable || Start()

3. running  || run()

4. waiting  || sleep(),wait()

5. dead

Note : user can call start() method. and ThreadSecheduler call run() method
user can't call run() method

-----

Thread Priority
---------------

MIN_PRIORITY  : 1

MAX_PRIORITY  : 10

NORM_PRIORITY : 5

Note : Thread priority cannot guarantee the order


------------

Daemon Thread
-------------

Daemon thread is a low priority thread

Example : Garbage Collection

JVM terminates itself when all normal threads finish its execution

JVM does not care about Daemon thread is running or not

JVM does not wait for Daemon thread before exiting while it waits for normal threads

---------

Volatile
--------

volatile is only a keyword, can be used only with variables.

being stored in main memory


---------

Thread Methods
--------------

Yield()

yield() and sleep() method belongs to java.lang.Thread class.

yield() and sleep() method can be called from outside synchronized block.

yield() and sleep() method are called on Threads not objects.

yield() method stops thread for unpredictable time

---------------

Object Method
-------------

Object class in java contains three methods

that allows threads to communicate about the lock status of a resource.

1. wait()

2. notify()

Wakes up a single thread that is waiting on this object's monitor.
 
3. notifyAll()

Wakes up all threads that are waiting on this object's monitor.

----------

Topics
--------
ThreadLocal

ThreadPool 

ThreadGroup

Thread Starvation

Busy spin