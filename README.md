Here are the steps to run the code:

First run
```
brew install coursier/formulas/coursier && cs setup
```

This will install Scala and the dependencies.

For file:  
`filter.scala`,
`fold.scala`,
`lambda.scala`,
`map.scala`
Go to the file directory, open terminal and run:
```
scalac {replace-this-with-file-name}
```
and then
```
scala {replace-this-with-file-name}
```

For running examples involving parallel collections using fold.
Go to folder "fold", type the following commands in terminal
```
sbt
run
```
You should be able to see the result.
