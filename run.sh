echo -n "" > ./target/libs/modules.xml
echo "<a>" >> ./target/libs/modules.xml

for entry in `(cd ./target/libs && ls *.jar)`
do
  echo "  <b>$entry</b>" >> ./target/libs/modules.xml
done

echo "</a>" >> ./target/libs/modules.xml
