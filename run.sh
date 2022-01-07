echo -n "" > modules.xml
echo "<a>" >> modules.xml

for entry in `ls target/libs/*.jar`
do
  echo "  <b>$entry</b>" >> modules.xml
done

echo "</a>" >> modules.xml
