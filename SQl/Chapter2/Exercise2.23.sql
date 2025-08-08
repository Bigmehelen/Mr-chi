USE cape_codd;
SELECT SKU, SKU_Description
from inventory
where QuantityOnHand = 0;