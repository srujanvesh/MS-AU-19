
input="C:\Users\kotha.srujanvesh\Desktop\Git\MS-AU-19\unixassign\list.csv"
IFS=","
NOW="06/2019"
month="${NOW:0:2}"
year="${NOW:3:7}"
while  read  f1 f2 f3 f4 f5 f6 f7 f8 f9 f10 f11
do
	
	
	#if [ $f8 -ge $NOW ]
	#then
	#	vari='active'
	#else
	#	vari='expired'
	#fi

	output=$(echo $f11 | sed ':a;s/\B[0-9]\{3\}\>/,&/;ta')
	output="$output"
	
	month1="${f8:0:2}"

	
	year1="${f8:3:7}"
	if [ $year1 -gt $year ]
  	then
		vari='active'
	elif [ $year1 -eq $year ] && [  $month1 -ge $month ]
	then
		vari='active'
	else 
		vari='expired'        
	fi

	
	if [ ! -d "$f2" ]
 	then
		mkdir "$f2"
	fi

	if [ ! -d "$f2/$f3" ]
	then
		mkdir "$f2/$f3"
	fi
	
	location="$f2/$f3/$f4.$vari"
	touch "$location"

	
	echo  "Card Type Code:$f1 ">"$location"
	echo   "Card Type Full Name: $f2">>"$location" 
        echo  "Issuing Bank: $f3">>"$location"
        echo   "Card Number: $f4">>"$location"
	echo   "Card Holder's Name: $f5" >>"$location" 
        echo   "CVV/CVV2: $f6" >>"$location"
        echo  "Issue Date: $f7" >>"$location"
        echo  "Expiry Date: $f8" >>"$location"
        echo   "Billing Date: $f9" >>"$location"
        echo   "Card PIN:$f10" >>"$location"
        echo   "Credit Limit: "$output"" >>"$location"
	
done<$input
