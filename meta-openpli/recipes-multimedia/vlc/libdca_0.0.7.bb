SUMMARY = "decoding library for DTS Coherent Acoustics streams"
SECTION = "libs/multimedia"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools

SRC_URI = "http://download.videolan.org/pub/videolan/libdca/${PV}/libdca-${PV}.tar.bz2 \
        file://fix-libdts-link-path.patch"
S = "${WORKDIR}/libdca-${PV}"

SRC_URI[md5sum] = "68916db60e3017d92841f77908518a11"
SRC_URI[sha256sum] = "3a0b13815f582c661d2388ffcabc2f1ea82f471783c400f765f2ec6c81065f6a"
