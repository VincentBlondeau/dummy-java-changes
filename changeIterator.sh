for i in {1..17}; do 
	git difftool -C -y --extcmd="/D/gumtree/gumtree-2.1.0-SNAPSHOT/bin/gumtree -v methoddiff" HEAD~$i HEAD~$(($i+1));
done