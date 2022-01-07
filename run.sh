echo -n "" > modules.xml
echo "<a>" >> modules.xml

for entry in `(cd ./target/libs && ls *.jar)`
do
  echo "  <b>$entry</b>" >> modules.xml
done

echo "</a>" >> modules.xml
