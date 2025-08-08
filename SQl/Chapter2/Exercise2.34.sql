USE cape_codd;
SELECT sum(QuantityOnHand)
from inventory;

SELECT count(QuantityOnHand)
from inventory;

SELECT mean(QuantityOnHand)
from inventory;

SELECT max(QuantityOnHand)
from inventory;

SELECT avg(QuantityOnHand)
from inventory;
