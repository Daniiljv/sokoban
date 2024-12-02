MAIN_CLASS="Main"

echo "Compiling Java files..."
javac *.java
if [ $? -ne 0 ]; then
    echo "Compilation failed!"
    exit 1
fi

echo "Running the application..."
java "$MAIN_CLASS"

echo "Cleaning up compiled files..."
rm -f *.class

echo "Cleanup c
