Running JUnit 4 and JUnit 5 test cases side by side
==============

One of the ways to run JUnit 4 and JUnit 5 test cases side-by-side is to use JUnit Vintage engine along with JUnit Jupiter engine, for example:

        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.0.0-M5</version>
            <dependencies>
                <dependency>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                    <version>5.7.0</version>
                </dependency>                                 
            </dependencies>
        </plugin>