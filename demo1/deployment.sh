./gradlew build
$JBOSS_HOME/bin/jboss-cli.sh -c --user=admin --password=Admin#70365 --command="deploy ~/.m2/repository/mysql/mysql-connector-java/5.1.47/mysql-connector-java-5.1.47.jar"
data-source add --name=MySqlDS --connection-url=jdbc:mysql://localhost:3306/jboss --driver-name=mysql-connector-java-5.1.47.jar --jndi-name=java:jboss/datasources/MySqlDS --user-name=jboss --password=jboss
$JBOSS_HOME/bin/jboss-cli.sh -c --user=admin --password=Admin#70365 --command="deploy ./build/libs/demo1-0.0.1-SNAPSHOT.war --force"
$JBOSS_HOME/bin/jboss-cli.sh -c --user=admin --password=Admin#70365 --command="deployment-info"
