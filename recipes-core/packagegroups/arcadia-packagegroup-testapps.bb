DESCRIPTION = "Arcadia dev/test application packagegroup"
SUMMARY = "Arcadia packagegroup - dev/test"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS_${PN} = " \
    kmscube \
"