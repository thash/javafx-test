## local packages installed via maven

``````````````````
$ mvn install:install-file \
      -DgroupId=local.schudt \
      -DartifactId=datepicker \
      -Dversion=0.0.2 \
      -Dpackaging=jar \
      -Dfile=/path/to/download/schudt-javafx-datepicker-0.0.2.jar
``````````````````
