Object
│
└── Throwable
    │
    ├── Exception (Recoverable Errors)
    │   ├── Checked Exceptions (Compile-time)
    │   │   ├── IOException
    │   │   │   └── FileNotFoundException
    │   │   ├── ClassNotFoundException
    │   │   ├── InterruptedException
    │   │   └── NoSuchFieldException
    │   └── Unchecked Exceptions (Runtime Exceptions)
    │       └── RuntimeException
    │           ├── ArithmeticException
    │           ├── NullPointerException
    │           ├── NumberFormatException
    │           └── ArrayIndexOutOfBoundsException
    │               ├── NegativeSizeArrayException
    │               │   └── StringIndexOutOfBoundsException
    └── Error (Non-recoverable Errors)
        ├── OutOfMemoryError
        └── StackOverflowError